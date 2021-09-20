package ir.maktab.element;

public class ElementArray {
    public static void run() {
        Element[] elements = new Element[4];
        elements[0] = new MetalElement("Fe", 26, 55.845);
        elements[1] = new MetalElement("Al", 13, 26.982);
        elements[2] = new NonMetalElement("C", 6, 12.011);
        elements[3] = new NonMetalElement("N", 7, 14.0067);
        print(elements);
    }
    private static void print(Element[] elements) {
        for (Element element : elements) {
            System.out.println(element);
        }
    }
}
