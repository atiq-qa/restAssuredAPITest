package restAssuredAPITest;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssuredAPITest {  

		@Test
		public void getRequest()
		{
			String url = "http://dummy.restapiexample.com/api/v1/employee/1";
			RequestSpecification request = RestAssured.given();
			Response response = request.get(url);
			
			Assert.assertEquals(response.getStatusCode(), 200,"Response code not matching test failed");
			
		}
		
		@Test
		public void deleteRequest()
		{
			String url = "http://dummy.restapiexample.com/api/v1/delete/2";
			RequestSpecification request = RestAssured.given();
			Response response = request.delete(url);
			
			int responseCode = response.getStatusCode();
			Assert.assertEquals(responseCode,200);
			if(responseCode == 200)
			{
				System.out.println("successfully! deleted Records");
			}
			
			
		}
}
