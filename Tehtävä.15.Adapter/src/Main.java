public class Main {

    public static void main(String args[]) {
        Fighter knight= new Knight();
        Wizard wizard = new Wizard();
        WizardAdapter wizardAdapter = new WizardAdapter(wizard);

        knight.attack();
        knight.defend();
        knight.escape();

        wizardAdapter.attack();
        wizardAdapter.defend();
        wizardAdapter.escape();

    }
}
