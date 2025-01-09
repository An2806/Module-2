public class StopWatch {
    private long startTime;
    private long endTime;

    // Constructor không tham số khởi tạo startTime với thời gian hiện tại
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Getter cho startTime
    public long getStartTime() {
        return startTime;
    }

    // Getter cho endTime
    public long getEndTime() {
        return endTime;
    }

    // Phương thức start() để reset startTime
    public void Start() {
        this.startTime = System.currentTimeMillis();
    }

    // Phương thức stop() để thiết lập endTime
    public void Stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Phương thức tính thời gian đã trôi qua
    public long GetElapsedTime() {
        return endTime - startTime;
    }
}
