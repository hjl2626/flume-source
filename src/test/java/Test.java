/**
 * Created by hjl on 2016/9/5.
 */
public class Test {


    public static void main(String[] args){
//        System.out.print("2016-08-19 17:20:15,805 INFO [com.mongo.MongoDBUtil]".matches("[\\d-\\s:,]+\\s\\w*?\\s\\[.*"));
        System.out.print("2016-08-19 17:20:15,805 INFO [com.mongo.MongoDBUtil]".matches("^[\\d-\\s:,]+?\\w*?\\s+?\\[.*"));
    }

}
