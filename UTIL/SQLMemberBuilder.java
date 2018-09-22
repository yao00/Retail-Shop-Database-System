package UTIL;

/**
 * Created by VirgilZhang on 3/25/18.
 */
public class SQLMemberBuilder {
    public static String memberBuilder(String Email, Integer Points, Integer rewardRate) {
        String sql = "insert into Member values" +
                "(" + Email + Points + rewardRate + ")";
        return sql;
    }

    public static String deleteMember(String Email) {
        String sql = "DELETE FROM Member WHERE Email = " + Email;
        return sql;
    }

    public static String updateMemberPoints(String Email,Integer Points){
        String sql = "UPDATE Member SET Points = " + Points + "WHERE Email = " + Email;
        return sql;
    }
}
