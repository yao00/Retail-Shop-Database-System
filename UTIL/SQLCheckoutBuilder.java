package UTIL;

/**
 * Created by VirgilZhang on 3/25/18.
 */
public class SQLCheckoutBuilder {

    public static String checkoutBuilder(String TransectionNum,String dateTime,String PaymentMethod, String email,
                                         String e_id, Integer Amount){
        String sql = "insert into Transaction_DealWith_Pay values(" + TransectionNum + dateTime + PaymentMethod + email +e_id + Amount + ")";
        return sql;
    }

}
