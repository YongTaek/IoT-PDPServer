import httpServer.PDPServer;
import java.io.IOException;

public class Main {
    //TODO: 정책에서 Rule의 Target으로 family와 car을 옮긴 후 target을 삭제
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            PDPServer.getInstance().startServer();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
