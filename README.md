# spring-boot-graphql-rest

This project is an example for creating a GRAPHQL wrapper over existing rest apis.

This project handles join of multiple types.

To run and see the magic , run mvn clean install

Modify types.graphqls to have mappings of your types.

Create repository for each type , fetch the data from existing apis.

Defined end api need to be exposed. Then define resolvers and tell how to join all required types.

Here is how schema needs to defined for join 

type House {
 
  ownerName
  <b>address : [Address]
}

Then in resolver resolve house and address
