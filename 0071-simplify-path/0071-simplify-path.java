class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        
        String[] str = path.split("/");
        for(String s: str){
            if(s.isEmpty() || s.equals(".")){
                continue;
            }
            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.removeLast();
                }
            }
            else{
                stack.addLast(s);
            }
        }

        StringBuilder result = new StringBuilder();

        for(String dir: stack){
            result.append("/").append(dir);
        }

        return result.length()==0 ? "/":result.toString();

    }
}