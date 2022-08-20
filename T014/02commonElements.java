    private static void commonElements(int[] one,int[] two)
    {
        HashMap<Integer,Integer> fmap = new HashMap<>();

        for(int i : one)
        {
            fmap.put(i,fmap.getOrDefault(i,0)+1);
        }

        for(int j : two)
        {
            if(fmap.containsKey(j))
            {
                System.out.println(j);
                fmap.remove(j);
            }
        }
    }
