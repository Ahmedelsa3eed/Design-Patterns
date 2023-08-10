package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeManager {
    private Map<String, Shape> shapeMap = new HashMap<>();

    public void addShape(String key, Shape shape) {
        shapeMap.put(key, shape);
    }

    public Shape getShape(String key) {
        Shape shape = shapeMap.get(key);
        return shape.clone();
    }
    
}
