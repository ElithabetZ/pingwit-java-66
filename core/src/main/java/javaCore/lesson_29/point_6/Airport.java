package javaCore.lesson_29.point_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Airport {

    private Queue<Integer> arrivedAirplanes = new ConcurrentLinkedDeque<>();

    private Map<String, List<String>> airplaneToPassandersMap = new ConcurrentHashMap<>();

    public void arrive(Integer airplane){
        arrivedAirplanes.add(airplane);
    }

    public void checkIn(String airplane, String passenger){
        List<String> passengers = airplaneToPassandersMap.getOrDefault(airplane, new ArrayList<>());
        passengers.add(passenger);
    }
}
