breed[agents agent] 
breed[cops cop] 
breed[cells cell] 

cops-own [maxjailterm threshold ]
agents-own [k arrestprobability jailterm governmentlegitimacy active riskaversion grievance perceivedhardship movement ]
cells-own []

to setup
	clear-all
	setup-agents  
	setup-cops  
	setup-cells  
	reset-ticks
	;;TODO should be implemented
end
to setup-agents
	;;Start of user code agent
	;;TODO should be implemented
	;;End of user code
	create-agents (20.0) [ 
		move-to one-of patches with [not			  any? agents-here			  any? cops-here]
		set riskaversion 1.0
		set perceivedhardship 1.0
		set jailterm 0.0
		set governmentlegitimacy 0.83
		set active false
		set k 2.3
		set threshold 0.1
		set grievance perceivedhardship  *						1.0  -						governmentlegitimacy
	] 
end

to setup-cops
	;;Start of user code cop
	;;TODO should be implemented
	;;End of user code
	create-cops (20.0) [ 
		move-to one-of patches with [not			  any? agents-here			  any? cops-here]
		set maxjailterm 30.0
	] 
end
to-report agent-here
  report one-of agents-here
end
to-report cop-here
  report one-of cops-here
end
to-report cell-here
  report one-of cells-here
end
to setup-cells
  resize-world 0 20.0 0 20.0
  let i 0
    let j 0
    repeat 21 [ 
      set j 0
      repeat 21 [ 
        create-cells 1[ 
          setxy i j
          set hidden? true
        ] 
        set j j + 1
      ] 
      set i i + 1
   ] 
end


to estimatearrestprobability
 let c count  	cops-on neighbors

 let a count  	agents-on neighbors  	 with [ active?]
		set arrestprobability 1.0  -						exp				k  *						floor		c  /						a  +						1.0
end




to determinebehavior
	let test grievance  -	 	 	 riskaversion  *			arrestprobability
	
	ifelse test	 >	 threshold 
	
	[set active true]  
	[set active false]
	
	
	
end
to moveagent
	let targets neighbors  with[not		    any? cops-here		   and		   all? agents-here 		    [ jailterm		     >		     0.0]		   ]

	let numtargets count 		targets
	
	if numtargets	 >=	 1.0 
	[move-to one-of targets]
	
	
	
end
to reducejailterm
	
	if jailterm	 >	 1.0 
	[set jailterm jailterm - 1.0]
	
	
	
end
to enforce
	let suspect one-of agent neighbors active?

	let numsuspect count 		suspect
	
	if numsuspect	 >	 0.0 
	[set active false   	set jailterm random maxjailterm   	move-to one-of suspect]
	
	
	
end
to movecops
	let targets neighbors  with[not		    any? cops-here		   and		   all? agents-here 		    [ jailterm		     >		     0.0]		   ]

	let numtargets count 		targets
	
	if numtargets	 >=	 1.0 
	[move-to one-of targets]
	
	
	
end

to go

ask patches [ 
	ask cells[
	] 
	ask cops [
		movecops
		enforce
	] 
	ask agents [
		estimatearrestprobability
		moveagent
		determinebehavior
		reducejailterm
	] 
tick
end
