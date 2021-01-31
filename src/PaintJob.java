public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        int BucketsNeeded = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        else if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets == 0) {

            BucketsNeeded = getBucketCount(width, height, areaPerBucket);
        }
        else {
            double area = width * height;

            int total = (int)Math.ceil(area/areaPerBucket);

            total -= extraBuckets;
            BucketsNeeded = total;
        }
        return BucketsNeeded;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {

        int BucketsNeeded = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        else {
            double area = width * height;

            int total = (int)Math.ceil(area/areaPerBucket);

            BucketsNeeded = total;
        }
        return BucketsNeeded;

    }
    public static int getBucketCount(double area, double areaPerBucket) {
        int BucketsNeeded = 0;

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        else {


            int total = (int)Math.ceil(area/areaPerBucket);

            BucketsNeeded = total;
        }
        return BucketsNeeded;

    }
}
