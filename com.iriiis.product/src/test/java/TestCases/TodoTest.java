package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iriiis.product.com.iriiis.product.CreateTodo;
import BaseClass.BaseClass;

public class TodoTest extends BaseClass
{
	@Test
	public void Todo_validation() throws Exception
	{
	login("sivagami", "msd@1234");
	CreateTodo	Taskobj=PageFactory.initElements(driver, CreateTodo.class);
    Taskobj.TodoDetails("PLANET OF THE APES", "SOON IN TO CINEMAS", "rudra@iriiisdev.com");
   
    }
}
