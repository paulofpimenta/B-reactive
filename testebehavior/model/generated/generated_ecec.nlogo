breed[plants plant] 
breed[foragers forager] 

foragers-own [fertility_threshold catabolic_rate harvest_rate energy ]
plants-own [k r biomass ]

to setup
	clear-all
	setup-plants  
	setup-foragers  
	reset-ticks
	;;TODO should be implemented
end
to setup-foragers
	;;Start of user code Forager
	;;TODO should be implemented
	;;End of user code
	create-foragers (10.0) [ 
		move-to one-of
		set catabolic_rate 2.0
		set harvest_rate 0.5
		set energy 50.0
		set fertility_threshold 100.0
	] 
end

to setup-foragers
	;;Start of user code Forager
	;;TODO should be implemented
	;;End of user code
	create-foragers (10.0) [ 
		move-to one-of
		set catabolic_rate 2.0
		set harvest_rate 0.9
		set energy 50.0
		set fertility_threshold 100.0
	] 
end
to-report plant-here
  report one-of plants-here
end
to-report forager-here
  report one-of foragers-here
end
to setup-plants
  resize-world 0 20.0 0 20.0
  let i 0
    let j 0
    repeat 21 [ 
      set j 0
      repeat 21 [ 
        create-plants 1[ 
          setxy i j
		  set k 10.0
		  set r 0.2
		  set biomass random k
          set hidden? true
        ] 
        set j j + 1
      ] 
      set i i + 1
   ] 
end


to grow
		set biomass biomass  +		  		  		  r  *		 		 		 biomass  *						1.0  -		 		 		 biomass  /						k
end


to consumeenergy
	set energy energy - catabolic_rate

end
to eat
let aplantbiomass [biomass] of one-of plants-here
	set energy energy - harvest_rate  *	 	 	 aplantbiomass

	set biomass biomass - harvest_rate  *	 	 	 aplantbiomass

end


to tomove
	let alocalvariable 5.0

	let biomassofplant [biomass] of		 plant		-here

	let alocation max-one-of (patch-set (patch-set patch-here ) neighbors) [[biomass] of	plant-here]
	
	ifelse biomassofplant >= catabolic_rate 
	
	[move-to alocation]  
	[move-to one-of (patch-set neighbors patch-here )]
	
	
	
end
to toreproduce
	
	if energy	 >=	 fertility_threshold 
	[hatch-foragers 1.0[ move-to one-of neighbors set energy(50.0)  ]set energy energy - 50.0]
	
	
	
end
to todie
	
	if energy	 <	 0.0 
	[die]
	
	
	
end

to go

ask patches [ 
	ask plants[
		grow] 
	] 
	ask foragers [
		consumeenergy
		eat
		tomove
		toreproduce
		todie
	] 
tick
end
