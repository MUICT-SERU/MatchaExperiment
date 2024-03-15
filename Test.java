@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SizesRestControllerIT {

    @LocalServerPort
    int port;

    @Test
    public void test2() throws InterruptedException {
        given().port(port).basePath("/clothes").get("").then().statusCode(200);
    }

}
