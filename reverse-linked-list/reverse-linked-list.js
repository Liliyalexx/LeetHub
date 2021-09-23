/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    let [prev, cur] = [null, head]
    while(cur) {
        [cur.next, prev, cur] = [prev, cur, cur.next]
    }
    return prev
}