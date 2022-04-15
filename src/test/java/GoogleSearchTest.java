import Pages.GoogleSearchPage;
import Pages.ResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends TestBase {

    GoogleSearchPage GSP;
    ResultPage RP;

    @Test
    public void userSearchInGoogle(){

        GSP = new GoogleSearchPage(driver);
        GSP.SearchViatext();
        RP = new ResultPage(driver);
        RP.count();

        Assert.assertEquals("Used Cars for Sale in London | Great Local Deals | Gumtree",RP.actualTitle);

        System.out.println(RP.actualTitle);
    }
}
