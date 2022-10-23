package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> queueTransports = new LinkedList<>();

    public ServiceStation( ) {

    }


    public Queue<Transport> getQueueTransports() {
        return queueTransports;
    }

    public void setQueueTransports(Queue<Transport> queueTransports) {
        queueTransports = queueTransports;
    }

    private  void addInQueue(Transport newElement) {
        this.queueTransports.add(newElement);
    }

    public  void addCariInQueue(Car car) {
        addInQueue(car);
    }

    public  void addTruckInQueue(Truck truck) {
        addInQueue(truck);
    }

    public void service() {
        if (!queueTransports.isEmpty()) {
            Transport transport = queueTransports.poll();
            boolean result = transport.undergoDiagnostics();
            if (result) {
                transport.fixAuto();
            }
        }
    }

    public static void deleteFromQueue(Queue queueTransports, Transport newElement) {
        queueTransports.remove(newElement);
    }

}
