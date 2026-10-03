import java.util.*;
class TotalEnergy {
    void Calculation(double morningEnergy, double eveningEnergy) {
        double totalEnergy = morningEnergy + eveningEnergy;
        System.out.println("Total Energy generated in: " + totalEnergy);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the energy generated in the morning: ");
        double morningEnergy = sc.nextDouble();
        System.out.print("Enter the energy generated in the evening: ");
        double eveningEnergy = sc.nextDouble();
         TotalEnergy obj = new TotalEnergy();
        obj.Calculation(morningEnergy, eveningEnergy);
    }
}