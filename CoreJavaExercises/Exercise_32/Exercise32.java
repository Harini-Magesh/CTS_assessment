public class Exercise32 {
    public static void main(String[] args) {
       import java.sql.*;

public class StudentDAO {
    private Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "password");
    }

    public void insertStudent(int id, String name) throws SQLException {
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        }
    }

    public void updateStudent(int id, String newName) throws SQLException {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        }
    }
}
 // Exercise 32 code here
    }
}
