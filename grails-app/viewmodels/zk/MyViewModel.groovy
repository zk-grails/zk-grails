package zk

import org.zkoss.zk.grails.*

class MyViewModel extends GrailsViewModel {

    List<Comment> commentList
    Comment comment

    static binding = {
        'button > *' source: 'person', property: 'value'
    }

}