package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    String name;
    Queue<Transport> QueueTransports = new LinkedList<>();

    public ServiceStation(String name, Queue<Transport> queueTransports) {
        this.name = name;
        QueueTransports = queueTransports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Queue<Transport> getQueueTransports() {
        return QueueTransports;
    }

    public void setQueueTransports(Queue<Transport> queueTransports) {
        QueueTransports = queueTransports;
    }

    public  void addInQueue(Queue queueTransports, Transport newElement) {
        queueTransports.add(newElement);
    }
    public static void deleteFromQueue(Queue queueTransports, Transport newElement) {
        queueTransports.remove(newElement);
    }

}
