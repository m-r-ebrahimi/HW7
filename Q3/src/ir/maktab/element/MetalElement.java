package ir.maktab.element;

public class MetalElement extends Element {

    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    protected void describeElement() {
        System.out.println("Metal Element:" +
                "\n\tSymbol : " + this.getSymbol() +
                "\n\tAtomic Number : " + this.getAtomicNumber() +
                "\n\tAtomic Weight : " + this.getAtomicWeight() +
                "\n\ta metal element is an element that form positive ions and has metallic bonds. Most elements on the periodic table are metals. Examples of metal elements include iron, copper, silver, mercury, lead, aluminum, gold, platinum, zinc, nickel and tin.");
    }
}
