public class PopulationStatistics {
    public static void main(String[] args) {
        // Total population in the country
        int totalPopulation = 14000000;

        // Percentage of females in the population
        double femalePercentage = 55;

        // Percentage of males in the population
        double malePercentage = 100 - femalePercentage;


        double employedMalesPercentage = 45;

        double employedFemalesPercentage = 25;

        // Calculate the populations
        int malePopulation = (int) (totalPopulation * (malePercentage / 100));
        int femalePopulation = totalPopulation - malePopulation;

        int unemployedFemalePopulation = (int) (femalePopulation * (1 - employedFemalesPercentage / 100));
        int employedMalePopulation = (int) (malePopulation * (employedMalesPercentage / 100));
        int employedFemalePopulation = (int) (femalePopulation * (employedFemalesPercentage / 100));

        // Output the results
        System.out.println("i. The male population in the country: " + malePopulation);
        System.out.println("ii. The female population unemployed: " + unemployedFemalePopulation);
        System.out.println("iii. The total number of people employed: " + (employedMalePopulation + employedFemalePopulation));
    }
}
