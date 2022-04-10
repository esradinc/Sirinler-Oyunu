package prolab_2_proje_1;
import java.util.ArrayList;

public class Azman extends Karakter  {
ArrayList<location> visited=new ArrayList();
ArrayList<location> visitnext=new ArrayList();
location hedef;
location locationmatrix[][];
//location currentlocation;
int mazematrix[][];
//ArrayList<location> enkisayol=new ArrayList();
//location visiting;


public void setmazematrix(int matrix[][]) {
		mazematrix=new int[11][13];
		this.mazematrix=matrix.clone();
	}
public void sethedef(location iyikarakter) {
		this.hedef=iyikarakter;
		this.enkisayol.removeAll(enkisayol);
		this.visitnext.add(this.currentlocation);
		ilocations();
	}
	

private void ilocations() {
		locationmatrix=new location[11][13];
		for(int y=0;y<mazematrix.length;y++) {

			for(int x=0;x<mazematrix[y].length;x++) {
				location tempo=new location(x,y);
				if(mazematrix[y][x]==0) {
					tempo.duvar=true;
                                        visited.add(tempo);
				}
				locationmatrix[y][x]=tempo;
			}
		}
                

	}

        	private boolean nodevisited(location temp) {
                 
                    
		for(int i=0;i<this.visited.size();i++) {
                    
                    
			if((visited.get(i).getX()==temp.getX())&&(visited.get(i).getY()==temp.getY())) {

				return true;
			}
		}

		return false;
	}

                private void updatevisitnext(location temp) {

		//update list of nodes to be visited cost wise in ascending order
		boolean done=false;

		for(int i=0;i<visitnext.size();i++) {
			if(temp.cost<visitnext.get(i).cost) {
				visitnext.add(i, temp);
				done=true;
				break;
			}
		}
		if(!done) {
			visitnext.add(temp);
		}

	}
	public void EnKisaYol() {

		int hedefx,hedefy;
		hedefx=this.hedef.getX();
		hedefy=this.hedef.getY();


		int x,y;
		location visiting;

		if(visitnext.size()>0) {
			visiting=visitnext.get(0);
			x=visiting.getX();
			y=visiting.getY();


			if(hedefx==x&&hedefy==y) {

				this.enkisayol=(ArrayList<location>) visiting.shortpath.clone();

				visiting.shortpath.removeAll(enkisayol);
				visitnext.removeAll(visitnext);
				visited.removeAll(visited);

				if(this.enkisayol.size()<=1) {

					//yakaladik onu

					this.currentlocation.setX(hedefx);
					this.currentlocation.setY(hedefy);

					//System.out.println("------------------>yakaladim seni");

				}
				else {
					this.currentlocation.setX(this.enkisayol.get(0).getX());
					this.currentlocation.setY(this.enkisayol.get(0).getY());
					this.enkisayol.remove(0);
					
				}


				return;
			}

			else {

				visited.add(visiting);
				visitnext.remove(0);


				//visit top 

				if(y-1>=0) {
					if(!nodevisited(locationmatrix[y-1][x])) {
						location tempo=locationmatrix[y-1][x];

						if(tempo.cost==0||(visiting.cost<=tempo.cost+1)) {
						
								tempo.cost=visiting.cost+1;
								tempo.shortpath=(ArrayList<location>) visiting.shortpath.clone();////////////
								tempo.shortpath.add(tempo);		
								updatevisitnext(tempo);
								//System.out.println("top visited");	
							

						}	
					}

				}

  //visit right
                if (x + 1 <= 12) {
                    if (!nodevisited(locationmatrix[y][x + 1])) {
                        location tempo = locationmatrix[y][x + 1];

                        if (tempo.cost == 0 || (visiting.cost <= tempo.cost + 1)) {

                            tempo.cost = visiting.cost + 1;
                            tempo.shortpath = (ArrayList<location>) visiting.shortpath.clone();////////////
                            tempo.shortpath.add(tempo);
                            updatevisitnext(tempo);
                            //System.out.println("right visited");	

                        }
                    }

                }

				//visit bottom

				if(y+1<=10) {
					if(!nodevisited(locationmatrix[y+1][x])) {
						location tempo=locationmatrix[y+1][x];

						if(tempo.cost==0||(visiting.cost<=tempo.cost+1)) {
							
								tempo.cost=visiting.cost+1;
								tempo.shortpath=(ArrayList<location>) visiting.shortpath.clone();////////////
								tempo.shortpath.add(tempo);		
								updatevisitnext(tempo);
								//System.out.println("bottom visited");	
							

						}
					}

				}

				//visit left


				if(x-1>=0) {
					if(!nodevisited(locationmatrix[y][x-1])) {

						location tempo=locationmatrix[y][x-1];

						if(tempo.cost==0||(visiting.cost<=tempo.cost+1)) {
							
								tempo.cost=visiting.cost+1;
								tempo.shortpath=(ArrayList<location>) visiting.shortpath.clone();////////////
								tempo.shortpath.add(tempo);		
								updatevisitnext(tempo);
								//System.out.println("left visited");	
							

						}
					}
				}
				EnKisaYol();		
			}
		}
        }
                public void visitnextlist() {
		System.out.println("\n-----------------visit next list");
		for(int i=0;i<visitnext.size();i++) {
			System.out.println(visitnext.get(i).getX()+"  "+visitnext.get(i).getY());
		}
		System.out.println("\n-----------------");
	}
	public void kisayolugoster() {
		for(int i=0;i<this.enkisayol.size();i++) {
			System.out.println(enkisayol.get(i).getX()+"   "+enkisayol.get(i).getY());
		}
	}
        
        
    public void Ilerle() {//Dusman 1 birim ilerler.
        
    }

}