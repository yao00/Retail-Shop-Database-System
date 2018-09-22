package UTIL;

/**
 * Created by VirgilZhang on 3/27/18.
 */
public class SQLEmployeeFunctions {
    public static String productsInclude(String TransactionNum) {
        String sql = "SELECT Transaction_DealWith_Pay.TransactionNum, Include.P_id FROM Transaction_DealWith_Pay INNER JOIN" +
                "Include ON Transaction_DealWith_Pay.TransactionNum = Include.TransactionNum WHERE Transaction_DealWith_Pay.TransactionNum = " +
                TransactionNum;
        return sql;
    }

    public static String maxAmount() {
        String sql = "SELECT MAX(Amount) AS MaxAmount FROM Transaction_DealWith_Pay";
        return sql;
    }

    public static String selectWithMultipleConditions(String Condition1, String Condition2, String C1value, String C2value) {
        String sql = "SELECT * FROM product WHERE " + Condition1 + " =  AND" + Condition2 + " = ";
        return sql;
    }

}
