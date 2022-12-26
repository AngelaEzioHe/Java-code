public class MiGong {
    public static void main(String[] args) {
        int[][]map=new int[8][7];
        for(int i=0;i<7;i++){
            map[0][i]=map[7][i]=1;
        }
        for(int i=0;i<8;i++){
            map[i][0]=map[i][6]=1;
        }
        map[3][1]=map[3][2]=1;
        //map[1][2]=map[2][1]=map[2][2]=1;
        System.out.println("=====当前地图情况=====");
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        TTT t1=new TTT();
        t1.findWay2(map,1,1);
        System.out.println("=====找路的情况如下====");
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }

    }
}

class TTT{
    /*
        1.使用递归回溯的思想来解决老鼠出迷宫
        2.findWay方法是专门找出迷宫的路径
        3.如果找到，就返回true，否则返回false
        4.map[][]表示迷宫
        5.i,j是老鼠的位置，初始化位置是(1,1)
        6.是递归找路，所以规定map数组的各个值的含义
            0 表示可以走，1表示障碍物，2表示可以走，3表示走过但是走不通
        7.当map[6][5]=2,就说明找到通路，可以结束；否则继续找
        8.先确定老鼠找路的策略，下->右->上->左
    */
    public boolean findWay(int[][]map,int i,int j){
        if(map[6][5]==2){ //说明已经找到
            return true;
        }else{
            if(map[i][j]==0){ //当前这个位置为0，说明可以走
                //我们假定可以走通
                map[i][j]=2;
                //使用找路策略，来确定该位置是否真的可以走通
                if(findWay(map,i+1,j)){ //先走下
                    return true;
                } else if (findWay(map,i,j+1)) { //右
                    return true;
                } else if (findWay(map,i-1,j)) { //上
                    return true;
                } else if(findWay(map,i,j-1)){ //左
                    return true;
                } else{
                    map[i][j]=3;
                    return false;
                }
            } else{
                return false;
            }
        }
    }
    //修改找路策略，看看路径的变化
    //上->右->下->左
    public boolean findWay2(int[][]map,int i,int j){
        if(map[6][5]==2){ //说明已经找到
            return true;
        }else{
            if(map[i][j]==0){ //当前这个位置为0，说明可以走
                //我们假定可以走通
                map[i][j]=2;
                //使用找路策略，来确定该位置是否真的可以走通
                if(findWay2(map,i-1,j)){ //先走上
                    return true;
                } else if (findWay2(map,i,j+1)) { //右
                    return true;
                } else if (findWay2(map,i+1,j)) { //下
                    return true;
                } else if(findWay2(map,i,j-1)){ //左
                    return true;
                } else{
                    map[i][j]=3;
                    return false;
                }
            } else{
                return false;
            }
        }
    }
}