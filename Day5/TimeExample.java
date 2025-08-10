/*
 5. Nested Interface for Callback Handling
•	Create a class TimeServer which declares a public static nested interface named Client with void updateTime(LocalDateTime now).
•	The server class should have method registerClient(Client client) and notifyClients() to pass current time.
•	Implement at least two classes implementing Client, registering them, and simulate notifications.
 */
package Day5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


class TimeServer {
    
    public static interface Client {
        void updateTime(LocalDateTime now);
    }

    private final List<Client> clients = new ArrayList<>();

   
    public void registerClient(Client client) {
        if (client != null) {
            clients.add(client);
            System.out.println("Client registered: " + client.getClass().getSimpleName());
        }
    }


    public void notifyClients() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("\nNotifying clients at: " + now);
        for (Client client : clients) {
            client.updateTime(now);
        }
    }
}

class ClockDisplay implements TimeServer.Client {
 @Override
 public void updateTime(LocalDateTime now) {
     System.out.println("[ClockDisplay] Updated time: " + now.toLocalTime());
 }
}

class LoggerClient implements TimeServer.Client {
 @Override
 public void updateTime(LocalDateTime now) {
     System.out.println("[LoggerClient] Logged timestamp: " + now);
 }
}


public class TimeExample {

	public static void main(String[] args) {
		TimeServer server = new TimeServer();

        server.registerClient(new ClockDisplay());
        server.registerClient(new LoggerClient());

        server.notifyClients();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        server.notifyClients();
	}

}

/*
output:
Client registered: ClockDisplay
Client registered: LoggerClient

Notifying clients at: 2025-08-09T07:19:00.643759600
[ClockDisplay] Updated time: 07:19:00.643759600
[LoggerClient] Logged timestamp: 2025-08-09T07:19:00.643759600

Notifying clients at: 2025-08-09T07:19:02.646964300
[ClockDisplay] Updated time: 07:19:02.646964300
[LoggerClient] Logged timestamp: 2025-08-09T07:19:02.646964300

*/