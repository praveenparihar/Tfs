import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import com.tfs.dao.ClientDetailsDao;

@ContextConfiguration(locations = { "classpath*:mvc-dispatcher-servlet.xml" })
public class UnitTest {

	@Autowired
	private ClientDetailsDao clientDetailsDao;
	
	@Test
	public void test(){/*
		System.out.println("start");
		clientDetailsDao.getListClientDetails();
		
	*/}
}
