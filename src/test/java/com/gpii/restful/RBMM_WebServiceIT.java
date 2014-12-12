package com.gpii.restful;


import com.gpii.jsonld.JsonLDManager;
import com.gpii.utils.Utils;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.io.IOException;
import junit.framework.TestCase;

public class RBMM_WebServiceIT extends TestCase
{
    public void test_runJSONLDRules() 
    {
        System.out.println("\n****************************************");
        System.out.println("* Testing 'runJSONLDRules' web service *");
        System.out.println("****************************************");
        
        String inputJsonStr = null;
        String expectedOutputJsonStr = null;
        
        String filepathIN = System.getProperty("user.dir") + "/src/main/webapp/WEB-INF/testData/preferences/input_test1.json";
        String filepathExpectedOUT = System.getProperty("user.dir") + "/src/main/webapp/WEB-INF/testData/expectedTestOutcomes/expected_output_test1.json";
        
        // read input & expected output
        try {
            inputJsonStr = Utils.getInstance().readFile(filepathIN);
            expectedOutputJsonStr = Utils.getInstance().readFile(filepathExpectedOUT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/RBMM/runJSONLDRules");
        ClientResponse response = webResource.accept("application/json").type("application/json").post(ClientResponse.class, inputJsonStr);
        String output = Utils.getInstance().jsonPrettyPrint(response.getEntity(String.class));
        
        System.out.println("\nWeb service output:\n");
        System.out.println(output);
               
        assertEquals(output, expectedOutputJsonStr);
    }
    
    public void test_vladimirLobby(){
        
    	System.out.println("\n*****************************************************");
        System.out.println("* Testing 'Vladimir at the Lobby' *");
        System.out.println("*******************************************************");    	
    	
        String inputJsonStr = null;
        String expectedOutputJsonStr = null;
        
        String filepathIN = System.getProperty("user.dir") + "/src/main/webapp/WEB-INF/testData/preferences/vladimir.json";
        String filepathExpectedOUT = System.getProperty("user.dir") + "/src/main/webapp/WEB-INF/testData/expectedTestOutcomes/vladimirOUT.json";
        
        // read input & expected output
        try {
            inputJsonStr = Utils.getInstance().readFile(filepathIN);
            expectedOutputJsonStr = Utils.getInstance().readFile(filepathExpectedOUT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/RBMM/runJSONLDRules");
        ClientResponse response = webResource.accept("application/json").type("application/json").post(ClientResponse.class, inputJsonStr);
        String output = response.getEntity(String.class);
        
        System.out.println("\nWeb service output:\n");
        System.out.println(output);
               
        assertEquals(output, expectedOutputJsonStr);
    	
    }
    public void test_VladimirSubway(){
        
    	System.out.println("\n*****************************************************");
        System.out.println("* Testing 'Vladimir at the Subway' ********************");
        System.out.println("*******************************************************");    	
    	
        String inputJsonStr = null;
        String expectedOutputJsonStr = null;
        
        String filepathIN = System.getProperty("user.dir") + "/src/main/webapp/WEB-INF/testData/preferences/vladimirSubway.json";
        String filepathExpectedOUT = System.getProperty("user.dir") + "/src/main/webapp/WEB-INF/testData/expectedTestOutcomes/vladimirSubwayOUT.json";
        
        // read input & expected output
        try {
            inputJsonStr = Utils.getInstance().readFile(filepathIN);
            expectedOutputJsonStr = Utils.getInstance().readFile(filepathExpectedOUT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/RBMM/runJSONLDRules");
        ClientResponse response = webResource.accept("application/json").type("application/json").post(ClientResponse.class, inputJsonStr);
        String output = response.getEntity(String.class);
        
        System.out.println("\nWeb service output:\n");
        System.out.println(output);
               
        assertEquals(output, expectedOutputJsonStr);
    	
    }    
    
    public void test_resolveMSC_OneSolutionPreffered(){
        
    	System.out.println("\n*****************************************************");
        System.out.println("* Testing 'Resolution of Multiple Solution Conflict  ' *");
        System.out.println("* Test criteria: one solution preferred; no AT suits ' *");
        System.out.println("*******************************************************");    	
    	
        String inputJsonStr = null;
        String expectedOutputJsonStr = null;
        
        String filepathIN = System.getProperty("user.dir") + "/src/main/webapp/WEB-INF/testData/preferences/MSC_oneInstATpreferred_noATSuite.json";
        String filepathExpectedOUT = System.getProperty("user.dir") + "/src/main/webapp/WEB-INF/testData/expectedTestOutcomes/MSC_oneInstATpreferred_noATSuiteOUT.json";
        
        // read input & expected output
        try {
            inputJsonStr = Utils.getInstance().readFile(filepathIN);
            expectedOutputJsonStr = Utils.getInstance().readFile(filepathExpectedOUT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/RBMM/runJSONLDRules");
        ClientResponse response = webResource.accept("application/json").type("application/json").post(ClientResponse.class, inputJsonStr);
        String output = response.getEntity(String.class);
        
        System.out.println("\nWeb service output:\n");
        System.out.println(output);
               
        assertEquals(output, expectedOutputJsonStr);
    	
    }   

    public void test_resolveMSC_MultiSolutionPreffered(){
        
    	System.out.println("\n*************************************************************************");
        System.out.println("* Testing 'Resolution of Multiple Solution Conflict  ' ********************");
        System.out.println("* Test criteria: multiple ATs of same type installed ' ********************");
        System.out.println("* multiple preferred installed; one installed not preferred; AT suits ' *");
        System.out.println("***************************************************************************");    	
    	
        String inputJsonStr = null;
        String expectedOutputJsonStr = null;
        
        String filepathIN = System.getProperty("user.dir") + "/src/main/webapp/WEB-INF/testData/preferences/MSC_multiInstATpreferred_noATSuite.json";
        String filepathExpectedOUT = System.getProperty("user.dir") + "/src/main/webapp/WEB-INF/testData/expectedTestOutcomes/MSC_multiInstATpreferred_noATSuiteOUT.json";
        
        // read input & expected output
        try {
            inputJsonStr = Utils.getInstance().readFile(filepathIN);
            expectedOutputJsonStr = Utils.getInstance().readFile(filepathExpectedOUT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/RBMM/runJSONLDRules");
        ClientResponse response = webResource.accept("application/json").type("application/json").post(ClientResponse.class, inputJsonStr);
        String output = response.getEntity(String.class);
        
        System.out.println("\nWeb service output:\n");
        System.out.println(output);
               
        assertEquals(output, expectedOutputJsonStr);
    	
    } 
    
    public void test_transformOwlToJSONLD() 
    {
        if(JsonLDManager.getInstance().INTEGRATION_TESTS_INCLUDE_ONTOLOGY_TRANSFORMATION_INTO_JSONLD)
        {
            System.out.println("\n*********************************************************************************************************************************");
            System.out.println("* Testing 'transformOwlToJSONLD' web service                                                                                    *");
            System.out.println("*                                                                                                                               *");
            System.out.println("* Please be patient. This process will take some minutes. The whole solutions ontology is being transformed into JSON-LD format.*");
            System.out.println("* You can disable this test by setting in config file -> INTEGRATION_TESTS_INCLUDE_ONTOLOGY_TRANSFORMATION_INTO_JSONLD = false  *");
            System.out.println("*********************************************************************************************************************************");

            Client client = Client.create();
            WebResource webResource = client.resource("http://localhost:8080/RBMM/transformOwlToJSONLD");
            ClientResponse response = webResource.get(ClientResponse.class);
            String output = response.getEntity(String.class);

            System.out.println("\nWeb service output:\n");
            System.out.println(output);

            //assertEquals(output, expectedOutputJsonStr);
        }
        else
        {
            System.out.println("\n******************************************************************************************************************************************************************************");
            System.out.println("* Testing of 'transformOwlToJSONLD' was skipped because it's a time consuming process (config file -> INTEGRATION_TESTS_INCLUDE_ONTOLOGY_TRANSFORMATION_INTO_JSONLD = false) *");
            System.out.println("******************************************************************************************************************************************************************************\n");
        }

    }
    
}