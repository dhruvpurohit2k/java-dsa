//We check to see weather start lies between exsisting value or if end does. If both dont we add it.
class MyCalendar {
    List<Integer> startList;
    List<Integer> endList;

    public MyCalendar() {
        startList = new ArrayList<>();
        endList = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        if (startList.size() == 0) {
            this.startList.add(start);
            this.endList.add(end);
            return true;
        } else {
            int count = 0;
            for (; count < startList.size(); count++) {
                if (this.startList.get(count) <= start && this.endList.get(count) > start)
                    return false;
                if (this.startList.get(count) >= start
                        && this.startList.get(count)<end)
                    return false;
            }
            this.startList.add(start);
            this.endList.add(end);
            Collections.sort(this.startList);
            Collections.sort(this.endList);
            return true;
        }
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
