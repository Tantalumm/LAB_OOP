public class StopWatch {
        private long stratTime = System.currentTimeMillis();
        private long endTime = stratTime;
    
        public StopWatch(){
    
        }
        public long getStartTime(){
            return this.stratTime;
        }
        public long getEndTime(){
            return this.endTime;
        }
        public void start(){
            this.stratTime = System.currentTimeMillis();
        }
        public void stop(){
            this.endTime = System.currentTimeMillis();
        }
        public long getElapsedTime(){
            return this.endTime - this.stratTime;
        }
}
    
