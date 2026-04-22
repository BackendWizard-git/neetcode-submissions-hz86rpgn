class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[]resultSet=new int[2];
        List<Integer> intList=new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
           intList.add(numbers[i]);
        }
         for(int i=0;i<numbers.length;i++){
           int digit=numbers[i];
           int numberToGet=target-digit;
           if(intList.contains(numberToGet)){
            int j = intList.indexOf(numberToGet);
            resultSet[0]=i+1;
            resultSet[1]=intList.indexOf(numberToGet);
            if(resultSet[1]==intList.indexOf(numberToGet)){
              resultSet[1]=intList.lastIndexOf(numberToGet)+1;
              break;
            }
           }

        }
        return resultSet;
    }
}
