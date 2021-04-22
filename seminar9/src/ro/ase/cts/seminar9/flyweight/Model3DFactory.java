package ro.ase.cts.seminar9.flyweight;

import java.util.HashMap;

public class Model3DFactory {
	static HashMap<ModelType, ModelFlyweightInterface>models=new HashMap<>();

	static {
		models=new HashMap<>();
		models.put(ModelType.SOLDIER, new Model3DFlyweight("soldier"));
		models.put(ModelType.TREE, new Model3DFlyweight("tree"));
	}
	
	public static ModelFlyweightInterface  getModel(ModelType type) {
		return models.get(type);
	}
}
