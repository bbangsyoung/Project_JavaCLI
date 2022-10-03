package X_Before_code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class JDBC {

        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/JDBC";
            String id = "root";
            String pw = "0000";
            Connection conn = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, id, pw);
                System.out.println("Connection 객체 생성성공");
            }
            catch(ClassNotFoundException e) {
                System.out.println("드라이버 로드 실패");
            }
            catch(SQLException e) {
                System.out.println("Connection 객체 생성 실패");
            }
            finally {
                try {
                    if(conn != null)
                        conn.close();
                }
                catch(SQLException e) {
                    System.out.println("conn.close() 에러");
                }
            }
        }

    }

