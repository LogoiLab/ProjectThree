package pkg;

public class BundleFactory{
	private static final BundleFactory instance = new BundleFactory();

	//private constructor to avoid client applications to use constructor
	private BundleFactory(){}

	public static BundleFactory getInstance(){
		return instance;
	}
}