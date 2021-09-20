package ir.maktab.element;

public class NonMetalElement extends Element {

    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    protected void describeElement() {
        System.out.println("Metal Element:" +
                "\n\tSymbol : " + this.getSymbol() +
                "\n\tAtomic Number : " + this.getAtomicNumber() +
                "\n\tAtomic Weight : " + this.getAtomicWeight() +
                "\n\tThe nonmetal element group is a subset of the nonmetals. The nonmetal element group consists of hydrogen, carbon, nitrogen, oxygen, phosphorus, sulfur and selenium. Hydrogen acts as a nonmetal at normal temperatures and pressure and is generally accepted to be part of the nonmetal group.\n" +
                "\n" +
                "The halogens are nonmetals in group 7 of the periodic table. Atoms of these elements have the -1 oxidation state. The elements at the top of the group are gases, but they become liquids and solids moving down the group. The halogens are fluorine, chlorine, bromine, iodine, and astatine. The properties of tennessine are not well-known. Tennessine might be a halogen or it might be a metalloid.\n" +
                "\n" +
                "The noble gases are relatively nonreactive gases found in group 8 (the last column) of the period table. The noble gases are helium, neon, argon, krypton, xenon, radon, and oganesson. It’s likely oganesson is not a gas at room temperature.");
    }
}
