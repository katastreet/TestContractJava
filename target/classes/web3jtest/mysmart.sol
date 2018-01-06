pragma solidity ^0.4.0;

/* permission contract interface*/
contract Permission{
    function canRead(address _address) constant returns(bool){return true;}
    function canWrite(address _address) constant returns(bool){return true;}
}
contract SimpleStorage {
    
    /* permission contract */
    Permission permission;
    
    modifier canRead {
        require(permission.canRead(msg.sender));
        _;
    }
    
    modifier canWrite{
        require(permission.canWrite(msg.sender));
        _;
    }
    
    function SimpleStorage(address _permission){
        permission = Permission(_permission);
    }
    
    mapping(bytes32 => uint) intStorage;
    mapping(bytes32 => string) stringStorage;
    mapping(bytes32 => bytes32) byteStorage;
    mapping(bytes32 => address) addressStorage;
    
    


    function setInt(bytes32 key, uint x) canWrite {
        intStorage[key] = x;
    }

    function getInt(bytes32 key) canRead constant returns (uint) {
        return intStorage[key];
    }
    
    function setString(bytes32 key, string x) canWrite {
        stringStorage[key] = x;
    }

    function getString(bytes32 key) canRead constant returns (string) {
        return stringStorage[key];
    }
     
    function setByte(bytes32 key, bytes32 x) canWrite {
        byteStorage[key] = x;
    }

    function getByte(bytes32 key) canRead constant returns (bytes32) {
        return byteStorage[key];
    }
    function setAddress(bytes32 key, address x) canWrite {
        addressStorage[key] = x;
    }

    function getAddress(bytes32 key) canRead constant returns (address) {
        return addressStorage[key];
    }
    

}