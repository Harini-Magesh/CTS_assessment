public class Exercise33 {
    public static void main(String[] args) {
        import java.sql.*;

public class BankDAO {
    public void transfer(int fromId, int toId, double amount) {
        String withdraw = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String deposit = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "password")) {
            conn.setAutoCommit(false);

            try (PreparedStatement ps1 = conn.prepareStatement(withdraw);
                 PreparedStatement ps2 = conn.prepareStatement(deposit)) {

                ps1.setDouble(1, amount);
                ps1.setInt(2, fromId);
                ps1.executeUpdate();

                ps2.setDouble(1, amount);
                ps2.setInt(2, toId);
                ps2.executeUpdate();

                conn.commit();
            } catch (Exception e) {
                conn.rollback();
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
// Exercise 33 code here
    }
}
