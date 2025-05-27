public class Exercise31 {
    public static void main(String[] args) {
       class StudentDAO {
    private Connection conn;

    public StudentDAO() throws Exception {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "root", "password");
    }

    public void fetchStudents() throws Exception {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
        }
    }

    public void insertStudent(int id, String name) throws Exception {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO students VALUES (?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
    }

    public void updateStudent(int id, String name) throws Exception {
        PreparedStatement ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?");
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
    }
} // Exercise 31 code here
    }
}
