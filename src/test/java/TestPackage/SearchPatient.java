package TestPackage;

import org.testng.annotations.Test;

import Actions.SearchPageActions;
import Base.Baseclass;

public class SearchPatient extends Baseclass{
	
	@Test
	
	public void PsearchNHI()
	{
		SearchPageActions SearchAction = new SearchPageActions();
		SearchAction.SearchByName("300518", driver);
		SearchAction.SearcBtn(driver);
	}

}
