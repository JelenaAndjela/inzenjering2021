package inz.social_engineering.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import inz.social_engineering.model.Company;

public class CompanyRepository extends AbstractRepository<Company>{

	private String queryString = 
			"BASE <http://www.support-system.org>" + 
			"PREFIX eok: <http://www.support-system.org#>" + 
			"PREFIX xsd: <http://w3.org/2001/XMLSchema#>" + 
			"SELECT ?ID ?Ime  " + 
			"WHERE {" + 
			"	?a a eok:Patient." + 
			"  	?a eok:id ?ID." + 
			"  	?a eok:name ?Ime." ;
	
	@Override
	public Company findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Company> findAll() {
		// TODO Auto-generated method stub
		List<Company> companies = new ArrayList<Company>();
		
		ResultSet results = executeQuery(queryString + "}");
		while (results.hasNext()) {
			QuerySolution solution = results.nextSolution() ;
		
/*			String id = solution.getLiteral("ID").getString();
			String name = solution.getLiteral("Ime").getString();
			
			System.out.println(id + " " + name + " ");
			
			Company company = new Company(id, name);
			companies.add(company);
*/		}
		return companies;
	}

	
	public Company save(Company entity) {
		// TODO Auto-generated method stub
		entity.setId(UUID.randomUUID());
		String insertString = 
				"BASE <http://www.support-system.org>" + 
				"PREFIX eok: <http://www.support-system.org#>" + 
				"PREFIX xsd: <http://w3.org/2001/XMLSchema#>" + 
				"INSERT DATA {" + 
				"  eok:" + entity.getName() + " a eok:Patient;" + 
				"	 eok:id \"" + entity.getId() + "\"^^xsd:string;" +
				"    eok:name \"" + entity.getName() + "\"^^xsd:string;" + 
				"}";

		System.out.println("Saving entity: " + entity);
		
		executeUpdate(insertString);		
        
		return entity;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Company update(Company entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
