package org.tfa.test.matching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.tfa.test.matching.DataLoader;
import org.tfa.test.matching.DataLoader.Person;

public class Matcher {

    /*
     * This method will be built out at past of the coding exercise
     */
    public String getBestMatch() {

    	DataLoader dt = new DataLoader();    	
    	Person P = new Person();
        P.id = "1";
        P.name = "Peter";
        P.color = "Blue";
        P.gender = "Male";
        P.state = "NY";
        P.field = "Advertising";        
        
        Map<String,Integer> values = new HashMap<String,Integer>();

        int j = 0;
        ArrayList<Person> people = dt.getData();
        for(Person p : people) {
        	if(P.id.equals(p.id)) j++;
        	if(P.name.equals(p.name)) j++;
        	if(P.color.equals(p.color)) j++;
        	if(P.gender.equals(p.gender)) j++;
        	if(P.state.equals(p.state)) j++;
        	if(P.state.equals(p.field)) j++;
        	values.put(p.id, j);
        	j = 0;
        }
        
        int MAX = 0;
        String ID = null;
        for(String id : values.keySet()) {
        	if(values.get(id) > MAX) {
        		ID = id;
        		MAX = values.get(id);        		
        	}
        }
    	
    	return "The person with ID: " + ID + " has the maximum value with: " + MAX;
    }
}
