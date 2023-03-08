public class cause{
    private String causeName;
    private List<NonProfit> nps;
    private List<Hashmap<cause,List<NonProfit>> allCauses;
    public cause(String causeName){
        this.causeName=causeName;
        nps=new ArrayList<>();
        allCauses=List<Hashmap<cause,List<NonProfit>>;
       
    }

    public void addNonProfit(NonProfit np, cause cause1){
        for(int index=0;index<=allCauses.size();index++){
            if(allCauses.get(index).containsKey(cause1)){
               List<NonProfit> temp=allCauses.get(index).get(cause1);
               temp.add(np);
               allCauses.put(cause1,temp);  
            }
        }
       
    }
}

//Class Cause
//Causemap: [key is causeobject, list of non profit objects)
//Cause object (name)
