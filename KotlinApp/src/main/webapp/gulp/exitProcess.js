module.exports = function(exit) {
    return function() {
        if(exit) {
            process.exit(1);
        }
    }
};