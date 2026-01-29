class RandomizedSet {
    Set<Integer> set;
    public RandomizedSet() {
        this.set = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        if(this.set.contains(val)){
            return false;
        }
        this.set.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(this.set.contains(val)){
            this.set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
            if(set.size()>0){
                List<Integer> list = new ArrayList<>(set);
                Random random = new Random();
                return list.get(random.nextInt(list.size()));
            }
        return -1;    
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */