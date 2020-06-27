public class ServiceStatistic {

    public long findMax(long[] incomes){
        long currentMaxIndex = 0;
        long currentMax = incomes[0];
        for (long income : incomes)
            if (currentMax < income)
                currentMax = income;
            return currentMax;
    }
}
