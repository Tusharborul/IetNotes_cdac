//function with rest operator
const total = function (...n) 
						{
							let tot=0;
							for(let e of n) {
								if(typeof e==='number')
									tot+=e;
							}
							return tot;
						}					 