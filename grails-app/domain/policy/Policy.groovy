package policy
import grails.rest.*

@Resource(uri='/policies', formats=['json','xml'])
class Policy {

    int number
    int amount
    static constraints = {   
    number blamk:false
    amount blank:false             
    }
}
