# bookie

I have a problem. The problem is that bookkeeping is boring and hard work. I think it should not be hard or boring. The current software to solve the bookkeeping problem are to complicated. This is meant as a project for me to try out things and learn more Clojure but I wanted to use an actual real world problem that I have thought about a lot, instead of some made up problem.

This is not meant as a solution for all types of companies or people, it's going to be pretty specific to my current situation. It also helps that me and a friend have tried to develop similar applications before.

## Goals
The things I want to solve are:

- Automatically check my business account for incomes.
- Automatically check my business account for expenses, 
  - And guess the proper tax rate based on the type of expenditure.
- Show monthly, quartely and yearly incomes, expenditures and taxes.
- Allow me to change things when needed.
- Automatically calculate the quartely tax based on the swedish tax system.
- Automatically calculate the yearly tax based on the swedish tax system.

## Solving
How will I solve this? Well, I haven't thought much about the interface, user friendly from my POW could be the command line as well as a webapp. The plan is too tackle the logic first, it's quite complicated to get it right. A lot the of the goals are to automate the bookkeeping process, which means that the interface will be less of a problem.

Other than that, I don't really have a plan.

## License

Fuck Copyright © Forever 

Distributed under the Eclipse Public License, the same as Clojure.
