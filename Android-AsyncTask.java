// AsyncTask template. Types jumbled up to clearly identify them.

private class AsyncTaskTemplate extends AsyncTask<Long, Integer, String> {
    @Override
    protected void onPreExecute() { }

    @Override
    protected String doInBackground(Long... params) {
        return "Not Implemented";
    }

    @Override
    protected void onProgressUpdate(Integer... values) { }

    @Override
    protected void onPostExecute(String result) { }
}
